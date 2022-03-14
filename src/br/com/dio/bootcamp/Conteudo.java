package br.com.dio.bootcamp;

public abstract class Conteudo {
    protected static final int XP_DEFALT = 50;
    private String titulo;
    private String description;
    private int xp;

    public abstract int calcularXp();

    public int getXp() { return xp; }

    public void setXp(int xp) { this.xp = xp; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
