

@FunctionalInterface /*@FunctionalInterface A anotação @FunctionalInterface 
é usada para garantir que a interface funcional não possa ter mais de um método 
abstrato. No caso de mais de um método abstrato estar presente, o compilador 
sinaliza uma mensagem 'Anotação @FunctionalInterface inesperada'.
 No entanto, não é obrigatório usar esta anotação. */


//Lista de interfaces funcionais pré-prontas do java o pacote java.util.function no Java 8 contém muitas interfaces funcionais integradas como- 


// Link bom para cola: https://acervolima.com/interfaces-funcionais-em-java/
public interface Autentica<T>{

    /* O que é uma interface funcional?

     * Interfaces funcionais são interfaces que têm um 
     * método a ser implementado, em outras palavras, um 
     * método abstrato. Isso significa que toda interface 
     * criada que respeite esta premissa, tornando-se automaticamente uma 
     * interface funcional.
     */

    public abstract boolean autenticarSenha(String T);
    

}