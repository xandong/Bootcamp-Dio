import br.com.dio.bootcamp.Curso;
import br.com.dio.bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescription("Descrição do curso de Java");
        curso1.setCagaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria em Java");
        mentoria1.setDescription("Descrição da mentoria em Java");
        mentoria1.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescription("Descrição do curso de JavaScript");
        curso2.setCagaHoraria(3);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria em JavaScript");
        mentoria2.setDescription("Descrição da mentoria em JavaScript");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
        System.out.println(curso2);
        System.out.println(mentoria2);
    }
}
