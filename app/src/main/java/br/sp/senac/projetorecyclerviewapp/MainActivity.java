package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Livros> lstLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inserindo os livros no arrayList vazio
        lstLivros = new ArrayList<>();
        lstLivros.add(new Livros("Principia: Princípios Matemáticos de Filosofia Natural","Provavelmente o livro de ciências naturais de maior influência já publicado, contém as leis de Newton para o movimento dos corpos, fundamentação da mecânica clássica, assim como a lei da gravitação universal.", "10/10", R.drawable.matematica));
        lstLivros.add(new Livros("O Mundo Assombrado Pelos Demônios","Preocupado com o vírus do analfabetismo científico, que faz com que hoje muitos acreditem em explicações místicas e superstições, Carl Sagan faz uma defesa apaixonada da ciência, com humor e clareza.","10/10", R.drawable.assombrado));
        lstLivros.add(new Livros("Variedades da Experiência Científica", "Numa série de palestras proferidas em 1985, o astrofísico Carl Sagan discute a existência de Deus, expõe suas esperanças de encontrar vida inteligente em outros planetas e manifesta o desejo de que a religião seja usada para melhorar a vida do ser humano.", "9/10", R.drawable.variedades));
        lstLivros.add(new Livros("Bilhões e Bilhões", "Os artigos deste livro póstumo do astrônomo Carl Sagan falam sobre a vida e a morte do Universo, da Terra e das pessoas. O tom às vezes é poético, mas sem se distanciar da racionalidade que Sagan sempre cultivou.", "9/10", R.drawable.bilhoes));
        lstLivros.add(new Livros("Contato", "Como reagiríamos ao travar contato com uma civilização extraterrestre? Sobre essa incógnita, Sagan tece uma história que indaga acerca do encontro entre os homens e do indivíduo consigo mesmo.", "10/10", R.drawable.contato));
        lstLivros.add(new Livros("Cosmos", "A mais inteligente e imaginativa reflexão sobre as dimensões geológicas, antropológicas, biológicas, históricas e astronômicas do universo..", "10/10", R.drawable.cosmos));
        lstLivros.add(new Livros("Pálido Ponto Azul", "Análise das conquistas práticas e teóricas das viagens espaciais, abordada do ponto de vista das modificações introduzidas na visão que o homem tem de si mesmo e do seu lugar no espaço.", "9/10", R.drawable.ponto));
        lstLivros.add(new Livros("Minha Breve História", "Minha breve história mostra o universo que existe por trás do gênio e é o primeiro relato escrito inteiramente por Stephen Hawking desde Uma breve história do tempo.", "10/10", R.drawable.minha));
        lstLivros.add(new Livros("Uma Breve História do Tempo","Uma das mentes mais geniais do mundo moderno, Stephen Hawking guia o leitor na busca por respostas a algumas das maiores dúvidas da humanidade: Qual a origem do universo? Ele é infinito? E o tempo? Houve um começo e haverá um fim? Existem outras dimensões além das três espaciais? E o que vai acontecer quando tudo terminar?","10/10", R.drawable.tempo));
        lstLivros.add(new Livros("O Universo Numa Casca de Noz","O universo numa casca de noz é leitura obrigatória para aqueles que querem se aventurar no que há de mais instigante hoje na física e para os que almejam ver como muitas vezes a teoria pode ser muito mais extraordinária do que a ficção científica.","10/10", R.drawable.universo));
        lstLivros.add(new Livros("Buracos Negros", "Enquanto a maioria dos especialistas se conforma com o fato de trabalhar com temas praticamente ininteligíveis para o público geral, Stephen Hawking tomou para si o papel de grande paladino da divulgação científica - e nesse pequeno livro, mais uma vez, extrapola todas as expectativas.", "8/10", R.drawable.buracos));
        lstLivros.add(new Livros("Breves Respostas para Grandes Questões", "Aliado à curiosidade que o impulsionou por toda a vida, ele projeta seu olhar para o futuro, buscando soluções para problemas que ameaçam hoje o mundo como o conhecemos, tais como o aquecimento global, a fome e a urgência de um desenvolvimento sustentável.", "8/10", R.drawable.respostas));
        lstLivros.add(new Livros("O Universo Elegante", "Traduzindo o pensamento físico-matemático para o plano da lógica visual, Greene mostra como a teoria das supercordas pode compatibilizar os dois pilares antagônicos da física moderna - a relatividade geral e a mecânica quântica - e levar a uma compreensão final sobre a estrutura e o funcionamento do universo.", "10/10", R.drawable.elegante));
        lstLivros.add(new Livros("O Tecido do Cosmo", "Levando em conta estudos recentes sobre cosmologia, o autor de O universo elegante fala, em linguagem clara e direta, da origem e do destino do universo, bem como das especulações científicas sobre a estrutura do espaço e do tempo.", "9/10", R.drawable.tecido));
        lstLivros.add(new Livros("A Realidade Oculta", "Em A realidade oculta, o norte-americano Brian Greene explica as leis fundamentais do cosmo e a intrincada física dos universos paralelos com uma linguagem didática e divertida.", "10/10", R.drawable.realidade));
        lstLivros.add(new Livros("Origens", "Ele não é só um meme na internet. Neil deGrasse Tyson, apresentador de TV, te convida para um passeio pelo Cosmos. Iniciando com o Big Bang, passando pelo início da vida na terra e a busca da vida extraterrestre, os autores avançam até a primeira imagem do nascimento de uma galáxia e seguem até a exploração de Marte pela sonda Spirit, sem deixar de fora eventos como a descoberta de água em uma das luas de Júpiter.", "10/10", R.drawable.origens));
        lstLivros.add(new Livros("Morte no Buraco Negro", "Buraco Negro explora uma miríade de tópicos da astronomia e Neil deGrasse Tyson guia seus fãs através dos mistérios do universo.", "9/10", R.drawable.buraconegro));
        lstLivros.add(new Livros("Astrofísica para Apressados", "Quem nunca olhou para o céu numa noite estrelada e se perguntou: que lugar ocupo no espaço? O que tudo isso significa? Como funciona? Em Astrofísica para apressados, o aclamado astrofísico e pesquisador Neil deGrasse Tyson responde a essas e outras perguntas que certamente todos já fizeram sobre o universo.", "8/10", R.drawable.astrofisica));
        lstLivros.add(new Livros("Alice no País do Quantum", "Nessa genial mistura de fantasia e ciência, Alice, aquela do País das Maravilhas, está prestes a embarcar em outra jornada. Ela conhecerá o País do Quantum – uma espécie de parque de diversões intelectual menor que um átomo – e irá se deparar com desafios, jogos e atrações que esclarecem os diferentes aspectos da física quântica.", "7/10", R.drawable.quantum));
        lstLivros.add(new Livros("A Origem das Espécies", "Publicado em 1859, A Origem das Espécies, de Charles Darwin, ficou conhecido como '' O livro que abalou o mundo''. Sua primeira edição se esgotou logo no promeiro dia e o mesmo ocorreu com seis versões porteriores. Até hoje a teoria da evolução do naturalista gera polêmica. Segundo Darwin, as espécies competem pela sobrevivência, as que sobrevivem dão origem à próxima geração, que por sua vez incorpora as variações naturais favoráveis e as repassa de maneira hereditária.","10/10", R.drawable.origem));

        //declarando a variavel xml enviando para o java
        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        //Instânciando o adaptador com os valores necessários
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), lstLivros);
        //Criando o layout para inserção dos valores

        //LayoutManager não é necessário inserção de colunas - pode ser utilizado na vertical ou horizontal
       // mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,true));

        //GriLayoutManager necessário a inserção de colunas
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //Para melhorar a performance do RecyclerView na listagem
        mRecyclerView.setHasFixedSize(true);

        //Inserindo os valores na lista do RecyclerView
        mRecyclerView.setAdapter(mAdapter);


    }
}
