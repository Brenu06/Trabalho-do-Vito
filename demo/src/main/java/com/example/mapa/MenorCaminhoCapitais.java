package com.example.mapa;


public class MenorCaminhoCapitais {
    private static Grafo grafoCapitais;
    public static void inicializarGrafo() {
    grafoCapitais = new Grafo();

    String[] capitais = {
        "Sao Paulo", "Rio de Janeiro", "Belo Horizonte", "Vitoria",
        "Salvador", "Fortaleza", "Recife", "Natal", "Teresina", "Aracaju",
        "Maceio", "Joao Pessoa", "Sao Luis",
        "Curitiba", "Porto Alegre", "Florianopolis",
        "Manaus", "Belem", "Porto Velho", "Palmas", "Rio Branco", "Macapa", "Boa Vista",
        "Goiania", "Brasilia", "Campo Grande", "Cuiaba"
    };

    for (String capital : capitais) {
        grafoCapitais.adicionarVertice(capital);
    }

    // Sudeste
    grafoCapitais.adicionarAresta("Sao Paulo", "Rio de Janeiro", 430);
    grafoCapitais.adicionarAresta("Rio de Janeiro", "Belo Horizonte", 437);
    grafoCapitais.adicionarAresta("Belo Horizonte", "Vitoria", 520);
    grafoCapitais.adicionarAresta("Rio de Janeiro", "Vitoria", 520);
    grafoCapitais.adicionarAresta("Sao Paulo", "Curitiba", 408);
    grafoCapitais.adicionarAresta("Sao Paulo", "Belo Horizonte", 586);

    // Sul
    grafoCapitais.adicionarAresta("Curitiba", "Florianopolis", 300);
    grafoCapitais.adicionarAresta("Florianopolis", "Porto Alegre", 476);
    
    //Sul-Centro-Oeste
    grafoCapitais.adicionarAresta("Curitiba", "Campo Grande", 1000);

    // Nordeste (litoral, de sul para norte)
    grafoCapitais.adicionarAresta("Salvador", "Aracaju", 356);
    grafoCapitais.adicionarAresta("Aracaju", "Maceio", 294);
    grafoCapitais.adicionarAresta("Maceio", "Recife", 285);
    grafoCapitais.adicionarAresta("Recife", "Joao Pessoa", 120);
    grafoCapitais.adicionarAresta("Joao Pessoa", "Natal", 185);
    grafoCapitais.adicionarAresta("Natal", "Fortaleza", 537);

    // Nordeste (interior)
    grafoCapitais.adicionarAresta("Fortaleza", "Teresina", 634);
    grafoCapitais.adicionarAresta("Teresina", "Sao Luis", 446);

    // Nordeste-Norte
    grafoCapitais.adicionarAresta("Sao Luis", "Belem", 800);


    // Centro-Oeste
    grafoCapitais.adicionarAresta("Brasilia", "Goiania", 209);
    grafoCapitais.adicionarAresta("Goiania", "Cuiaba", 934);
    grafoCapitais.adicionarAresta("Goiania", "Campo Grande", 935);
    grafoCapitais.adicionarAresta("Campo Grande", "Cuiaba", 694);

    // Centro-Oeste-Norte
    grafoCapitais.adicionarAresta("Cuiaba", "Porto Velho", 1450);
    grafoCapitais.adicionarAresta("Porto Velho", "Rio Branco", 510);

    // Norte
    grafoCapitais.adicionarAresta("Porto Velho", "Manaus", 901);
    grafoCapitais.adicionarAresta("Manaus", "Boa Vista", 785);

    grafoCapitais.adicionarAresta("Manaus", "Macapa", 1500); // via balsa/barco1

    // Norte-Nordeste
    grafoCapitais.adicionarAresta("Belem", "Macapa", 606); // via balsa/barco
    grafoCapitais.adicionarAresta("Belem", "Palmas", 1600);

    // Centro-Oeste-Norte
    grafoCapitais.adicionarAresta("Palmas", "Goiania", 874);
    grafoCapitais.adicionarAresta("Palmas", "Cuiaba", 1330);

    // Ligações interestaduais importantes (para garantir conectividade realista)
    grafoCapitais.adicionarAresta("Brasilia", "Belo Horizonte", 716);
    grafoCapitais.adicionarAresta("Brasilia", "Goiania", 209);
    grafoCapitais.adicionarAresta("Brasilia", "Cuiaba", 1133);
    grafoCapitais.adicionarAresta("Brasilia", "Salvador", 1444);
    grafoCapitais.adicionarAresta("Brasilia", "Palmas", 973);
    grafoCapitais.adicionarAresta("Brasilia", "Campo Grande", 1134);

    // Sudeste-Nordeste
    grafoCapitais.adicionarAresta("Vitoria", "Salvador", 1080);
    grafoCapitais.adicionarAresta("Belo Horizonte", "Salvador", 1372);
;

    // Outras ligações importantes para garantir conectividade
    grafoCapitais.adicionarAresta("Palmas", "Teresina", 1250);
    grafoCapitais.adicionarAresta("Palmas", "Sao Luis", 1370);

    // Exemplo de ligação para Macapá (via balsa para Belém)
    grafoCapitais.adicionarAresta("Macapa", "Belem", 606);
}
      public static Grafo getGrafoCapitais() {
        if (grafoCapitais == null) {
        inicializarGrafo();
    }
    return grafoCapitais;
}}