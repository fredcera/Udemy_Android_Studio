package curso.udemy.appaula1.model;

//Pojo = só tem os atributos, construtores padrões e geter e seter
public class MediaEscolar {

    private String materia;
    private String bimestre;
    private String situacao;
    private Double notaProva;
    private Double notaMateria;
    private Double mediaFinal;

    public MediaEscolar(){

    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }

    public Double getNotaMateria() {
        return notaMateria;
    }

    public void setNotaMateria(Double notaMateria) {
        this.notaMateria = notaMateria;
    }

    public Double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(Double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
}
