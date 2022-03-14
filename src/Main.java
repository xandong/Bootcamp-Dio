import br.com.dio.bootcamp.Bootcamp;
import br.com.dio.bootcamp.Curso;
import br.com.dio.bootcamp.Dev;
import br.com.dio.bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescription("Descrição do curso de Java");
        curso1.setCagaHoraria(6);
        curso1.calcularXp();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria em Java");
        mentoria1.setDescription("Descrição da mentoria em Java");
        mentoria1.setData(LocalDate.now());
        mentoria1.calcularXp();

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescription("Descrição do curso de JavaScript");
        curso2.setCagaHoraria(3);
        curso2.calcularXp();

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria em JavaScript");
        mentoria2.setDescription("Descrição da mentoria em JavaScript");
        mentoria2.setData(LocalDate.now());
        mentoria2.calcularXp();

//        System.out.println(curso1);
//        System.out.println(mentoria1);
//        System.out.println(curso2);
//        System.out.println(mentoria2);
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescription("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Java Developer");
        bootcamp2.setDescription("Descrição Bootcamp Java Developer");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.inscreverBootcamp(bootcamp2);
        dev1.inscrito(dev1.getNome() , dev1.getConteudosInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp2);
        dev2.inscrito(dev2.getNome() , dev2.getConteudosInscritos());

        dev1.concluido();
        dev1.concluido();
        dev1.inscrito(dev1.getNome() , dev1.getConteudosInscritos());


    }
}
