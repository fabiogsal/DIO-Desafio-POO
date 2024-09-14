import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcampo Java Dev");
        bootcamp1.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp1.getConteudosSet().add(curso1);
        bootcamp1.getConteudosSet().add(curso2);
        bootcamp1.getConteudosSet().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp1);
        devPedro.progredir();
        devPedro.progredir();

        System.out.println("Conteudos incritos Pedro: " + devPedro.getConteudosInscritoSet());
        System.out.println("Conteudos concluidos Pedro: " + devPedro.getConteudosConcluidosSet());
        System.out.println("Conteudos incritos Pedro: " + devPedro.getConteudosInscritoSet());
        System.out.println("XP Pedro: " + devPedro.calcularXp());

        System.out.println("--------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        devJoao.progredir();

        System.out.println("Conteudos incritos Joao: " + devJoao.getConteudosInscritoSet());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidosSet());
        System.out.println("XP Joao: " + devJoao.calcularXp());
    }
}
