package com.github.thomasaqx.screenmatch;

import com.github.thomasaqx.screenmatch.models.Series;
import com.github.thomasaqx.screenmatch.service.ConsumoApi;
import com.github.thomasaqx.screenmatch.service.ConvertDados;
import com.github.thomasaqx.screenmatch.service.IConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner { //CommandoLineRunner permite integrar funcionalidades no CMD

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Consumindo API de séries: ");
        String apikey = "http://www.omdbapi.com/?apikey=2fe97349&t=dexter";
        //Criando objeto para converter dados e objeto para consumir API:
        ConvertDados conversor = new ConvertDados();
        ConsumoApi api = new ConsumoApi();

        //armazenando dados obtidos da api na variável json:
        var json =  api.consumirDados(apikey);

        //armazenando dados convertidos da api na variável dadosObtidos
        var dadosObtidos = conversor.obterDados(json, Series.class);
        System.out.println(dadosObtidos);



    }
}
