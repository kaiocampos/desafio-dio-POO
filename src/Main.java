import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScrip");
        curso2.setDescricao("descrição do curso javaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("descrição da mentoria 1");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devKampos = new Dev();
        devKampos.setNome("kampos");;
        devKampos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devKampos.getConteudosInscritos());
        devKampos.progredir();
        devKampos.progredir();
        System.out.println("-");

        System.out.println("Conteúdos concluidos do Kampos: " + devKampos.getConteudosInscritos());
        System.out.println("Conteúdos concluidos do Kampos: " + devKampos.getConteudosConcluidos());
        System.out.println("XP: "+ devKampos.calcularTotalXp());


        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.setNome("Joao");
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos concluidos do João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }
}