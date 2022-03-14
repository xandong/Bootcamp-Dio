package br.com.dio.bootcamp;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String description;
    private LocalDate data;

    public String getTitulo() {
        return titulo;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getData() {
        return data;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  "\n" + titulo +
                "\nDescricão: " + description +
                "\nData: " + data;
    }
}
