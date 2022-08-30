public class Mock implements Service{ //"IMITA" as funcionalidades do real
    
    @Override
    public String busca(int id) { //Vai retornar as infos diretamente sem precisar ir buscar externamente

        if (id == 10){
            return ProfessorConst.SONED;
        }
        if (id == 20){
            return ProfessorConst.GUILHERME;
        }
        if (id == 30){
            return ProfessorConst.YVO;
        }
        if (id == 0){
            return ProfessorConst.ERRO_NOME;
        }
        if (id == 1){
            return ProfessorConst.ERRO_HORARIO;
        }
        if (id == 2){
            return ProfessorConst.ERRO_PERIODO;
        }
        return null;
    }
}
