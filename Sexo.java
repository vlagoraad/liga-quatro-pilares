public enum Sexo {
        MULHER("Sexo feminino"), 
        HOMEM("Sexo masculino"), 
        OUTRO("outro sexo"), 
        PREFIRO_NAO_DIZER("prefiro não informar"); private final String description;
        Sexo(String description){
            this.description = description;
        };
        public String getdescription(){
            return this.description;
        }
    }