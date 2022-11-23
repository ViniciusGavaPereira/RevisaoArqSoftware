

@FunctionalInterface /*@FunctionalInterface A anota��o @FunctionalInterface 
� usada para garantir que a interface funcional n�o possa ter mais de um m�todo 
abstrato. No caso de mais de um m�todo abstrato estar presente, o compilador 
sinaliza uma mensagem 'Anota��o @FunctionalInterface inesperada'.
 No entanto, n�o � obrigat�rio usar esta anota��o. */


//Lista de interfaces funcionais pr�-prontas do java o pacote java.util.function no Java 8 cont�m muitas interfaces funcionais integradas como- 


// Link bom para cola: https://acervolima.com/interfaces-funcionais-em-java/
public interface Autentica<T>{

    /* O que � uma interface funcional?

     * Interfaces funcionais s�o interfaces que t�m um 
     * m�todo a ser implementado, em outras palavras, um 
     * m�todo abstrato. Isso significa que toda interface 
     * criada que respeite esta premissa, tornando-se automaticamente uma 
     * interface funcional.
     */

    public abstract boolean autenticarSenha(String T);
    

}