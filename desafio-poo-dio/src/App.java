import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitulo("Curso de java");
        curso.setDescricao("Curso 1");
        curso.setCargaHoraria(9);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de javaScript");
        curso2.setDescricao("Curso 2");
        curso2.setCargaHoraria(13);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria 1");
        mentoria.setData(LocalDate.now());;

        Bootcamp bc = new Bootcamp();
        bc.setNome("Bootcamp Java Developer");
        bc.setDescricao("Descrição Bootcamp java dev");
        bc.getConteudo().add(curso);
        bc.getConteudo().add(curso2);
        bc.getConteudo().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Mateus Eduardo");
        dev.inscreverBootcamp(bc);
        System.out.println();
        System.out.println("Conteúdos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdos Concluídos " + dev.getNome() + ": " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
        System.out.println("--------------------------------------------------------------------------------------------");
        
        Dev dev2 = new Dev();
        dev2.setNome("Maria Eduarda");
        dev2.inscreverBootcamp(bc);        
        System.out.println("Conteúdos Inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdos Concluídos " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());


    }
}
