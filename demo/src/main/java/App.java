import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


//Busca o inimigo "remotamente"
public class App {
    Service Service;

    public App(Service Service){ //INJETANDO a dependencia pelo construtor
        this.Service = Service;
    }

    public Professor buscaProf(int id){

        String profJson = Service.busca(id);
        JsonObject jsonObject = JsonParser.parseString(profJson).getAsJsonObject();

        return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsInt(),
                jsonObject.get("periodo").getAsString());
    }

}
