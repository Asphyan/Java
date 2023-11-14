import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaMedica {

    static class Paciente {
        String nome;
        String horario;
    }

    List<Paciente> pacientes = new ArrayList<>();
    List<String> horariosDisponiveis = criarHorariosDisponiveis();
    Scanner scanner = new Scanner(System.in);

    private static List<String> criarHorariosDisponiveis() {
        List<String> horarios = new ArrayList<>();
        horarios.add("13:00");
        horarios.add("14:00");
        horarios.add("15:00");
        horarios.add("16:00");
        horarios.add("17:00");
        horarios.add("18:00");
        horarios.add("19:00");
        horarios.add("20:00");
        return horarios;
    }

    public void cadastro() {
        System.out.print("Informe o seu nome: ");
        String nomePaciente = scanner.next();

        System.out.println("Horários disponíveis:");
        for (String horario : horariosDisponiveis) {
            System.out.println(horario);
        }

        System.out.print("\nEscolha um horário disponível: ");
        String horarioEscolhido = scanner.next();

        if (horariosDisponiveis.contains(horarioEscolhido)) {
            Paciente paciente = new Paciente();
            paciente.nome = nomePaciente;
            paciente.horario = horarioEscolhido;

            pacientes.add(paciente);
            horariosDisponiveis.remove(horarioEscolhido);

            System.out.println("Consulta agendada com sucesso!");
        } else {
            System.out.println("Horário escolhido não está disponível. Tente novamente.");
        }
    }

    public void verificadorNome(String nomePaciente) {
        boolean pacienteEncontrado = false;
    
        for (Paciente paciente : pacientes) {
            if (paciente.nome.equals(nomePaciente)) {
                System.out.println("Paciente encontrado. Horário da consulta: " + paciente.horario);
                pacienteEncontrado = true;
                break;
            }
        }
    
        if (!pacienteEncontrado) {
            System.out.println("Não há paciente agendado com o nome fornecido.");
        }
    }
    
    public void verificadorHorario(String horarioEscolhido) {
        boolean pacienteEncontrado = false;
    
        for (Paciente paciente : pacientes) {
            if (paciente.horario.equals(horarioEscolhido)) {
                System.out.println("Paciente encontrado. Nome: " + paciente.nome);
                pacienteEncontrado = true;
                break;
            }
        }
    
        if (!pacienteEncontrado) {
            System.out.println("Não há paciente agendado para o horário escolhido.");
        }
    }
    

    public void imp() {
        System.out.println("Pacientes cadastrados:");
        for (Paciente paciente : pacientes) {
            System.out.println("Nome: " + paciente.nome + ", Horário: " + paciente.horario);
        }
    }
}



