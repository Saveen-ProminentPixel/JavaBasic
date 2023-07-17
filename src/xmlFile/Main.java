package xmlFile;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException, SAXException, ParseException {

        ProminentTrainee trainee1 = new ProminentTrainee(1,"Saveen","Dindoli","08/10/2000","07/10/2023",23);
        ProminentTrainee trainee2 = new ProminentTrainee(2,"Yash","Katodara","06/20/1998","02/08/2023",26);
        ProminentTrainee trainee3 = new ProminentTrainee(3,"Rahul","Adajan","04/22/1997","06/12/2023",27);
        ProminentTrainee trainee4 = new ProminentTrainee(4,"Vikas","Vesu","11/15/1999","05/21/2023",25);
        ProminentTrainee trainee5 = new ProminentTrainee(5,"Sunil","Varachha","09/30/2000","04/15/2023",23);

        List<ProminentTrainee> traineeList = new ArrayList<>();
        traineeList.add(trainee1);
        traineeList.add(trainee2);
        traineeList.add(trainee3);
        traineeList.add(trainee4);
        traineeList.add(trainee5);

        xmlFileCreate(traineeList);

        xmlFileRead();


    }


    public static void xmlFileCreate(List<ProminentTrainee> traineeList) throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory dBFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dBFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();

        // add element
        Element rootElement = doc.createElement("Trainees");
        //append root element
        doc.appendChild(rootElement);

        // add trainee element to doc
        for(ProminentTrainee trainee : traineeList){
            rootElement.appendChild(createTraineeElement(doc, trainee.traineeId, trainee.name, trainee.address, trainee.DOB, trainee.joiningDate, trainee.age));
        }

        // for output to file and console
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);

        // write to file and console
        StreamResult console = new StreamResult(System.out);
        StreamResult file = new StreamResult(new File("ProminentPractice.xml"));

        // write data
        transformer.transform(source, console);
        transformer.transform(source, file);

    }


    public static void xmlFileRead() throws ParserConfigurationException, IOException, SAXException, ParseException {

        File file = new File("ProminentPractice.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);

        // normalize the doc
        doc.getDocumentElement().normalize();
        System.out.println("Root Element : " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("Trainee");

        // convert to Object List
        List<ProminentTrainee> traineeList = new ArrayList<>();

        for(int i=0;i< nodeList.getLength();i++){
            traineeList.add(getTrainee(nodeList.item(i)));
        }

        for(ProminentTrainee trainee : traineeList){
            System.out.println(trainee.traineeId + " name : " + trainee.name + " Address : " + trainee.address + " DOB : " + trainee.DOB + " Joining Date : " + trainee.joiningDate + " Age: " + trainee.age);
        }

    }


    public static ProminentTrainee getTrainee(Node node) throws ParseException {

        ProminentTrainee trainee = new ProminentTrainee();
        if(node.getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) node;

            String id = element.getAttribute("id");
            trainee.traineeId = Integer.parseInt(id);

            trainee.setName(getTagValue("name", element));
            trainee.setAddress(getTagValue("address",element));
            trainee.setDOB(getTagValue("DOB",element));
            trainee.setJoiningDate(getTagValue("joiningDate",element));
            trainee.setAge(getTagValue("age",element));

        }
        return trainee;

    }

    public static String getTagValue(String tag, Element element){

        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();

    }


    public static Node createTraineeElement(Document doc, int id, String name, String address, Date DOB, Date joiningDate, int age){

        Element trainee = doc.createElement("Trainee");

        // Set Id attribute
        trainee.setAttribute("id", String.valueOf(id));

        // create name element
        trainee.appendChild(createUserDetails(doc, trainee, "name", name));
        // create address element
        trainee.appendChild(createUserDetails(doc, trainee, "address", address));
        // create DOB element
        trainee.appendChild(createUserDetails(doc, trainee, "DOB", String.valueOf(DOB)));
        // create joiningDate element
        trainee.appendChild(createUserDetails(doc, trainee, "joiningDate", String.valueOf(joiningDate)));
        // create age element
        trainee.appendChild(createUserDetails(doc, trainee, "age", String.valueOf(age)));

        return trainee;
    }


    public static Node createUserDetails(Document doc, Element element, String name, String value){

        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;

    }

}
