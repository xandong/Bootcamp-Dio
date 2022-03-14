package br.com.dio.bootcamp;

public class Curso extends Conteudo {
    private int cagaHoraria;

    public int getCagaHoraria() {
        return cagaHoraria;
    }

    public void setCagaHoraria(int cagaHoraria) {
        this.cagaHoraria = cagaHoraria;
    }

    @Override
    public int calcularXp() {
        setXp((getXp()+cagaHoraria*XP_DEFALT));
        return 0;
    }

    @Override
    public String toString() {
        return "\n" + getTitulo() +
                "\nDescrição: " + getDescription() +
                "\nCarga Horária: " + cagaHoraria + "h" +
                "\nExperiência: " + getXp() + " xp\n";
    }

}
