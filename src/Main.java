import br.com.java.desafio.dominio.Bootcamp;
import br.com.java.desafio.dominio.Curso;
import br.com.java.desafio.dominio.Dev;
import br.com.java.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java developer");
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRheryson = new Dev();
        devRheryson.setNome("Rheryson");
        devRheryson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Rheryson:" + devRheryson.getConteudoIncritos());
        devRheryson.progredir();
        devRheryson.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Rheryson:" + devRheryson.getConteudoIncritos());
        System.out.println("Conteudos Concluidos Rheryson:" + devRheryson.getConteudoConcluidos());
        System.out.println("XP: " + devRheryson.calcularTotalXp());



        System.out.println("-------");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao:" + devJoao.getConteudoIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao:" + devJoao.getConteudoIncritos());
        System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
