public class exemploForEmArray {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("Aluno no indice x = " + x + " é " + alunos[x]);
        }
    
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
