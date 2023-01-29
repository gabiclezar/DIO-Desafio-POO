import java.time.LocalDate;

import desafio.Bootcamp;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCargaHoraria((8));

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescrição("descrição curso js");
        curso2.setCargaHoraria((4));

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescrição("descrição mentoria java");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome ("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaroline =new Dev();
        devCaroline.setNome("Caroline");
        devCaroline.increverBootcamp(bootcamp);
        System.out.println("conteúdos Inscrito" + devCaroline.getConteudosInscrito());

        devCaroline.progredir();
        devCaroline.progredir();
        devCaroline.progredir();
        System.out.println("-");

        System.out.println("conteúdos Inscrito" + devCaroline.getConteudosInscrito());
        System.out.println("conteúdos Concluídos" + devCaroline.getConteudosConcluidos());
        System.out.println("XP:" + devCaroline.calcularTotalXp());


        System.out.println("----------");
        

        Dev devGabriele =new Dev();
        devGabriele.setNome("Gabriele");
        devGabriele.increverBootcamp(bootcamp);
        System.out.println("conteúdos Inscrito" + devGabriele.getConteudosInscrito());

        devGabriele.progredir();
        devGabriele.progredir();
        devGabriele.progredir();
        System.out.println("-");

        System.out.println("conteúdos Inscrito" + devGabriele.getConteudosInscrito());
        System.out.println("conteúdos Concluídos" + devGabriele.getConteudosConcluidos());
        System.out.println("XP:" + devGabriele.calcularTotalXp());

    }
}
