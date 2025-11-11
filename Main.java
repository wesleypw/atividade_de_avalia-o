import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<PessoaFisica> pessoasFisicas = new ArrayList<>();
    private static final List<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
    private static final List<Advogado> advogados = new ArrayList<>();
    private static final List<Juiz> juizes = new ArrayList<>();
    private static final List<Processo> processos = new ArrayList<>();
    private static final List<Resolucao> resolucoes = new ArrayList<>();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = lerInteiro("Digite sua opção: ");
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica();
                    break;
                case 2:
                    cadastrarPessoaJuridica();
                    break;
                case 3:
                    cadastrarAdvogado();
                    break;
                case 4:
                    cadastrarJuiz();
                    break;
                case 5:
                    cadastrarProcesso();
                    break;
                case 6:
                    registrarResolucao();
                    break;
                case 7:
                    listarPessoasFisicas();
                    break;
                case 8:
                    listarPessoasJuridicas();
                    break;
                case 9:
                    listarAdvogados();
                    break;
                case 10:
                    listarJuizes();
                    break;
                case 11:
                    listarProcessos();
                    break;
                case 12:
                    listarResolucoes();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("\nPressione Enter para continuar...");
            sc.nextLine();
        } while (opcao != 0);
        sc.close();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n=== SISTEMA DE GESTÃO JURÍDICA ===");
        System.out.println("1. Cadastrar Pessoa Física");
        System.out.println("2. Cadastrar Pessoa Jurídica");
        System.out.println("3. Cadastrar Advogado");
        System.out.println("4. Cadastrar Juiz");
        System.out.println("5. Cadastrar Processo");
        System.out.println("6. Registrar Resolução de Processo");
        System.out.println("7. Listar Pessoas Físicas");
        System.out.println("8. Listar Pessoas Jurídicas");
        System.out.println("9. Listar Advogados");
        System.out.println("10. Listar Juízes");
        System.out.println("11. Listar Processos");
        System.out.println("12. Listar Resoluções");
        System.out.println("0. Sair");
    }

    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!sc.hasNextInt()) {
            System.out.print("Por favor, digite um número válido: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    private static Date lerData(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem + " (dd/MM/yyyy): ");
                String dataStr = sc.nextLine();
                return dateFormat.parse(dataStr);
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            }
        }
    }

    private static void cadastrarPessoaFisica() {
        System.out.println("\n=== CADASTRO DE PESSOA FÍSICA ===");
        String nome = lerString("Nome: ");
        String cpf = lerString("CPF: ");
        String rg = lerString("RG: ");
        String telefone = lerString("Telefone: ");
        String email = lerString("E-mail: ");
        String endereco = lerString("Endereço: ");

        PessoaFisica pf = new PessoaFisica(nome, telefone, email, endereco, cpf, rg);
        pessoasFisicas.add(pf);
        System.out.println("\nPessoa Física cadastrada com sucesso!");
    }

    private static void cadastrarPessoaJuridica() {
        System.out.println("\n=== CADASTRO DE PESSOA JURÍDICA ===");
        String nomeFantasia = lerString("Nome Fantasia: ");
        String razaoSocial = lerString("Razão Social: ");
        String cnpj = lerString("CNPJ: ");
        String inscricaoEstadual = lerString("Inscrição Estadual: ");
        String telefone = lerString("Telefone: ");
        String email = lerString("E-mail: ");
        String endereco = lerString("Endereço: ");

        PessoaJuridica pj = new PessoaJuridica(nomeFantasia, telefone, email, endereco, 
                                                cnpj, inscricaoEstadual, razaoSocial);
        pessoasJuridicas.add(pj);
        System.out.println("\nPessoa Jurídica cadastrada com sucesso!");
    }

    private static void cadastrarAdvogado() {
        System.out.println("\n=== CADASTRO DE ADVOGADO ===");
        String nome = lerString("Nome: ");
        String cpf = lerString("CPF: ");
        String rg = lerString("RG: ");
        String oab = lerString("Número OAB: ");
        String especialidade = lerString("Especialidade: ");
        String telefone = lerString("Telefone: ");
        String email = lerString("E-mail: ");
        String endereco = lerString("Endereço: ");

        Advogado advogado = new Advogado(nome, telefone, email, endereco, cpf, rg, oab, especialidade);
        advogados.add(advogado);
        System.out.println("\nAdvogado cadastrado com sucesso!");
    }

    private static void cadastrarJuiz() {
        System.out.println("\n=== CADASTRO DE JUIZ ===");
        String nome = lerString("Nome: ");
        String cpf = lerString("CPF: ");
        String rg = lerString("RG: ");
        String matricula = lerString("Matrícula: ");
        String vara = lerString("Vara: ");
        String telefone = lerString("Telefone: ");
        String email = lerString("E-mail: ");
        String endereco = lerString("Endereço: ");

        Juiz juiz = new Juiz(nome, telefone, email, endereco, cpf, rg, matricula, vara);
        juizes.add(juiz);
        System.out.println("\nJuiz cadastrado com sucesso!");
    }

    private static void cadastrarProcesso() {
        if (pessoasFisicas.isEmpty() || advogados.isEmpty()) {
            System.out.println("\nÉ necessário ter pelo menos uma Pessoa Física e um Advogado cadastrados!");
            return;
        }

        System.out.println("\n=== CADASTRO DE PROCESSO ===");
        String numeroProcesso = lerString("Número do Processo: ");
        String descricao = lerString("Descrição: ");
        Date dataAbertura = lerData("Data de Abertura");

        // Selecionar Autor (Pessoa Física)
        System.out.println("\nSelecione o Autor (Pessoa Física):");
        listarPessoasFisicas();
        int indiceAutor = lerInteiro("Digite o número do Autor: ") - 1;
        if (indiceAutor < 0 || indiceAutor >= pessoasFisicas.size()) {
            System.out.println("Índice de Autor inválido!");
            return;
        }
        PessoaFisica autor = pessoasFisicas.get(indiceAutor);

        // Selecionar Réu (Pessoa Física ou Jurídica)
        System.out.println("\nO réu é Pessoa Física (1) ou Pessoa Jurídica (2)?");
        int tipoReu = lerInteiro("Opção: ");
        Pessoa reu = null;

        if (tipoReu == 1) {
            if (pessoasFisicas.size() < 2) {
                System.out.println("É necessário ter pelo menos duas Pessoas Físicas cadastradas!");
                return;
            }
            System.out.println("\nSelecione o Réu (Pessoa Física):");
            listarPessoasFisicas();
            int indiceReu = lerInteiro("Digite o número do Réu: ") - 1;
            if (indiceReu < 0 || indiceReu >= pessoasFisicas.size()) {
                System.out.println("Índice de Réu inválido!");
                return;
            }
            reu = pessoasFisicas.get(indiceReu);
        } else if (tipoReu == 2) {
            if (pessoasJuridicas.isEmpty()) {
                System.out.println("Não há Pessoas Jurídicas cadastradas!");
                return;
            }
            System.out.println("\nSelecione o Réu (Pessoa Jurídica):");
            listarPessoasJuridicas();
            int indiceReu = lerInteiro("Digite o número do Réu: ") - 1;
            if (indiceReu < 0 || indiceReu >= pessoasJuridicas.size()) {
                System.out.println("Índice de Réu inválido!");
                return;
            }
            reu = pessoasJuridicas.get(indiceReu);
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        // Selecionar Advogado
        System.out.println("\nSelecione o Advogado Responsável:");
        listarAdvogados();
        int indiceAdvogado = lerInteiro("Digite o número do Advogado: ") - 1;
        if (indiceAdvogado < 0 || indiceAdvogado >= advogados.size()) {
            System.out.println("Índice de Advogado inválido!");
            return;
        }
        Advogado advogado = advogados.get(indiceAdvogado);

        Processo processo = new Processo(numeroProcesso, descricao, dataAbertura, autor, reu, advogado);
        processos.add(processo);
        System.out.println("\nProcesso cadastrado com sucesso!");
    }

    private static void registrarResolucao() {
        if (processos.isEmpty()) {
            System.out.println("\nNão há processos cadastrados!");
            return;
        }
        if (juizes.isEmpty()) {
            System.out.println("\nNão há juízes cadastrados!");
            return;
        }

        System.out.println("\n=== REGISTRAR RESOLUÇÃO DE PROCESSO ===");
        
        // Listar processos em andamento
        System.out.println("\nProcessos em andamento:");
        int contador = 1;
        List<Processo> processosEmAndamento = new ArrayList<>();
        for (Processo p : processos) {
            if (p.getStatus().startsWith("Em andamento")) {
                System.out.println(contador + ". " + p);
                processosEmAndamento.add(p);
                contador++;
            }
        }

        if (processosEmAndamento.isEmpty()) {
            System.out.println("Não há processos em andamento para resolução!");
            return;
        }

        int indiceProcesso = lerInteiro("\nSelecione o número do processo para resolução: ") - 1;
        if (indiceProcesso < 0 || indiceProcesso >= processosEmAndamento.size()) {
            System.out.println("Índice de processo inválido!");
            return;
        }
        Processo processo = processosEmAndamento.get(indiceProcesso);

        // Selecionar Juiz
        System.out.println("\nSelecione o Juiz responsável:");
        listarJuizes();
        int indiceJuiz = lerInteiro("Digite o número do Juiz: ") - 1;
        if (indiceJuiz < 0 || indiceJuiz >= juizes.size()) {
            System.out.println("Índice de Juiz inválido!");
            return;
        }
        Juiz juiz = juizes.get(indiceJuiz);

        String decisao = lerString("Decisão (ex: Procedente, Improcedente, etc.): ");
        String fundamentacao = lerString("Fundamentação da decisão: ");

        Resolucao resolucao = new Resolucao(processo, juiz, decisao, fundamentacao);
        resolucoes.add(resolucao);
        System.out.println("\nResolução registrada com sucesso!");
    }

    private static void listarPessoasFisicas() {
        System.out.println("\n=== PESSOAS FÍSICAS CADASTRADAS ===");
        if (pessoasFisicas.isEmpty()) {
            System.out.println("Nenhuma pessoa física cadastrada.");
            return;
        }
        for (int i = 0; i < pessoasFisicas.size(); i++) {
            System.out.println((i + 1) + ". " + pessoasFisicas.get(i));
        }
    }

    private static void listarPessoasJuridicas() {
        System.out.println("\n=== PESSOAS JURÍDICAS CADASTRADAS ===");
        if (pessoasJuridicas.isEmpty()) {
            System.out.println("Nenhuma pessoa jurídica cadastrada.");
            return;
        }
        for (int i = 0; i < pessoasJuridicas.size(); i++) {
            System.out.println((i + 1) + ". " + pessoasJuridicas.get(i));
        }
    }

    private static void listarAdvogados() {
        System.out.println("\n=== ADVOGADOS CADASTRADOS ===");
        if (advogados.isEmpty()) {
            System.out.println("Nenhum advogado cadastrado.");
            return;
        }
        for (int i = 0; i < advogados.size(); i++) {
            System.out.println((i + 1) + ". " + advogados.get(i));
        }
    }

    private static void listarJuizes() {
        System.out.println("\n=== JUÍZES CADASTRADOS ===");
        if (juizes.isEmpty()) {
            System.out.println("Nenhum juiz cadastrado.");
            return;
        }
        for (int i = 0; i < juizes.size(); i++) {
            System.out.println((i + 1) + ". " + juizes.get(i));
        }
    }

    private static void listarProcessos() {
        System.out.println("\n=== PROCESSOS CADASTRADOS ===");
        if (processos.isEmpty()) {
            System.out.println("Nenhum processo cadastrado.");
            return;
        }
        for (int i = 0; i < processos.size(); i++) {
            System.out.println((i + 1) + ". " + processos.get(i));
        }
    }

    private static void listarResolucoes() {
        System.out.println("\n=== RESOLUÇÕES REGISTRADAS ===");
        if (resolucoes.isEmpty()) {
            System.out.println("Nenhuma resolução registrada.");
            return;
        }
        for (int i = 0; i < resolucoes.size(); i++) {
            System.out.println((i + 1) + ". " + resolucoes.get(i));
        }
    }
}
