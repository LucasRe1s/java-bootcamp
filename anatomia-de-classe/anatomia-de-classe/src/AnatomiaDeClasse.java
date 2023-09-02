public class AnatomiaDeClasse {
    public static void main(String[] args) {
        String primaryName = "Lucas";
        String secondName = "Reis";

        String fullName = fullName(primaryName, secondName); 
        System.out.println(fullName);
    }

    public static String fullName(String primaryName, String secondName) {
        return "resultado do metodo " + primaryName.concat(" ").concat(secondName);
    }
}
