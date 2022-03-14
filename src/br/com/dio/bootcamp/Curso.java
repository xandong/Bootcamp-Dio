package br.com.dio.bootcamp;

public class Curso {
    private String titulo;
    private String description;
    private int cagaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public String getDescription() {
        return description;
    }

    public int getCagaHoraria() {
        return cagaHoraria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCagaHoraria(int cagaHoraria) {
        this.cagaHoraria = cagaHoraria;
    }

    @Override
    public String toString() {
//        return "Curso{" +
//                "titulo='" + titulo + '\'' +
//                ", description='" + description + '\'' +
//                ", cagaHoraria=" + cagaHoraria +
//                '}';
        return "\n" + titulo +
                "\nDescrição: " + description +
                "\nCarga Horária: " + cagaHoraria + "h";
    }
}
