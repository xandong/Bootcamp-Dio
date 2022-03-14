package br.com.dio.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int calcularXp() {
        setXp((getXp()+XP_DEFALT));
        return 0;
    }

    @Override
    public String toString() {
        return  "\n" + getTitulo() +
                "\nDescrição: " + getDescription() +
                "\nData: " + data +
                "\nExperiência: " + getXp() + " xp\n";
    }
}
