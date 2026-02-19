package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import model.Root;
import model.Student;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Root root = mapper.readValue(new File("file.json"), Root.class);

        //Вычитываем данные
        System.out.println(root);

        //Записываем в файл объект root1
        Root root1 = new Root();
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("John");
        student1.setAge(20);
        root1.setCount(1);
        root1.setStudents(List.of(student1));

        mapper.writeValue(new File("fileNew.json"), root1);

        System.out.println(mapper.writeValueAsString(root1));
    }
}
