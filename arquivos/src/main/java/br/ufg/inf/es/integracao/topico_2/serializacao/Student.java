package br.ufg.inf.es.integracao.topico_2.serializacao;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by aluno on 09/04/18.
 */
public class Student implements Serializable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) {
            return false;
        }

        Student student = (Student) o;
        if (!name.equals(student.name)) {
            return false;
        }

        return true;
    }

    public static byte[] serialize(Student student) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(student);
        oos.close();

        byte[] byteArray = baos.toByteArray();

        return byteArray;
    }

    public static Student deserialize(byte[] byteArray) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        ObjectInputStream ois = new ObjectInputStream(bais);

        Student student = null;
        student = (Student) ois.readObject();

        ois.close();
        return student;
    }
}
