package br.ufg.inf.es.integracao.serializacao;

/**
 * Created by aluno on 09/04/18.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Student student = new Student("Matheus");
        byte[] byteArray;

        try {
            byteArray = Student.serialize(student);
            Student studentDeserialized = Student.deserialize(byteArray);
            System.out.println(studentDeserialized.getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
