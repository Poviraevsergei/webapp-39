package jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import model.Root;
import model.Student;

import java.io.File;
import java.util.List;

public class MainJaxB {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Root.class);

        //Читаем из Xml
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Root root = (Root) unmarshaller.unmarshal(new File("file.xml"));

        System.out.println(root);

        //Запись в файл
        Root rootOutput = new Root();
        rootOutput.setCount(2);
        Student studentEvgeniy = new Student();
        studentEvgeniy.setAge(19);
        studentEvgeniy.setId(1);
        studentEvgeniy.setName("Евгений");
        Student studentOsman = new Student();
        studentOsman.setAge(25);
        studentOsman.setId(2);
        studentOsman.setName("Осман");
        rootOutput.setStudents(List.of(studentEvgeniy, studentOsman));

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(rootOutput, new File("c39.xml"));
    }
}
