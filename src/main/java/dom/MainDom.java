package dom;

import model.Root;
import model.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class MainDom {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //Cоздаем экземпляр фабрики для парсера
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //Парсим xml файл
        Document doc = factory.newDocumentBuilder().parse(new File("file.xml"));

        Root root = new Root();
        List<Student> students = new ArrayList<>();
        Student student = null;

        NodeList nodeCount = doc.getElementsByTagName("count");
        if (nodeCount.getLength() == 1) {
            root.setCount(Integer.parseInt(nodeCount.item(0).getTextContent()));
        }

        NodeList studentList = doc.getElementsByTagName("student");
        if (studentList.getLength() == root.getCount()) {
            for (int i = 0; i < studentList.getLength(); i++) {
                Element studentElement = (Element) studentList.item(i);
                student = new Student();

                //Заполняем поле id
                student.setId(Integer.parseInt(studentElement.getAttribute("id")));

                //Заполняем поле name
                student.setName(studentElement.getElementsByTagName("name").item(0).getTextContent());

                //Заполняем поле age
                student.setAge(Integer.parseInt(studentElement.getElementsByTagName("age").item(0).getTextContent()));
                students.add(student);
            }
            root.setStudents(students);
        } else {
            throw new InputMismatchException("Incorrect Data");
        }

        System.out.println(root);
    }
}
