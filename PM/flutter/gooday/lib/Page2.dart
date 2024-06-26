import 'package:flutter/material.dart';

//AVISO PARA O RAFAEL OU LUIS EDUARDO:
//
//Vou deixar sem comentário, mas confia, fui eu que fiz tudo (da para ver pela gambiarra) e consigo explicar tudo (menos aqueles expanded da row la embaixo na pagina 2 que eu realmente peguei da internet (divisória fofa))
//
//Trabalhodo rodrigo scatolin flora do rio do 2° DS
//
//Mais uma coisa, o trabalho inteiro foi feito para EXATAMENTE a configuração do samsung galaxy s8+ na exibição mobile do inspecionar do google, se estiver errado fora disso não é culpa minha (é sim)

class Page2 extends StatefulWidget {
    const Page2({super.key});

    @override
    State<Page2> createState() => _ScreenState();
}

class _ScreenState extends State<Page2> {

    @override 
    Widget build(BuildContext context) {
        return Scaffold(
            body: Padding(
              padding: const EdgeInsets.all(15),
              child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                        IconButton(onPressed: () {Navigator.pop(context);}, icon: const Icon(Icons.arrow_back),),
                        const Padding(
                            padding: EdgeInsets.only(left: 10, top: 5),
                            child: Text(
                                style: TextStyle(fontSize: 36, fontWeight: FontWeight.bold, fontFamily: "Arial"),
                                "Acesse"
                            ),
                        ),
                        const Padding(
                            padding: EdgeInsets.only(left: 10),
                            child: Text(
                                style: TextStyle(fontSize: 12, fontWeight: FontWeight.w500, fontFamily: "Arial"),
                                "com E-mail e senha"
                            ),
                        ),
                        const Padding(
                            padding: EdgeInsets.only(left: 10, top: 20),
                            child: Text(
                                style: TextStyle(fontSize: 12, fontWeight: FontWeight.w500, fontFamily: "Arial"),
                                "Email"
                            ),
                        ),
                        const Padding(
                            padding: EdgeInsets.only(left: 10),
                            child: SizedBox(
                                width: 312,
                                child: TextField(
                                    decoration: InputDecoration(
                                        filled: true,
                                        fillColor: Color(0xffe3e7f3),
                                        border: OutlineInputBorder(borderSide: BorderSide.none),
                                        hintText: 'Digite seu E-mail',
                                        hintStyle: TextStyle(fontSize: 12, fontWeight: FontWeight.w500, color: Color(0xffa3a7b3)),
                                        isDense: true,
                                        contentPadding: EdgeInsets.only(top: 20, bottom: 25, left: 10),
                                    ),
                                ),
                            ),
                        ),
                        const Padding(
                            padding: EdgeInsets.only(left: 10, top: 20),
                            child: Text(
                                style: TextStyle(fontSize: 12, fontWeight: FontWeight.w500, fontFamily: "Arial"),
                                "Senha"
                            ),
                        ),
                        const Padding(
                            padding: EdgeInsets.only(left: 10),
                            child: SizedBox(
                                width: 312,
                                child: TextField(
                                    obscureText: true,
                                    decoration: InputDecoration(
                                        filled: true,
                                        fillColor: Color(0xffe3e7f3),
                                        border: OutlineInputBorder(borderSide: BorderSide.none),
                                        hintText: 'Digite sua senha',
                                        hintStyle: TextStyle(fontSize: 12, fontWeight: FontWeight.w500, color: Color(0xffa3a7b3)),
                                        isDense: true,
                                        contentPadding: EdgeInsets.only(top: 20, bottom: 25, left: 10),
                                    ),
                                ),
                            ),
                        ),
                        Padding(
                            padding: const EdgeInsets.only(left: 3, top: 20),
                            child: Row(
                                children: [
                                    Checkbox(
                                        value: false, 
                                        onChanged: (_) {},
                                        shape: RoundedRectangleBorder(
                                            borderRadius: BorderRadius.circular(5.0),
                                        ),
                                        side: const BorderSide(color: Color(0xff14c871)),
                                    ),
                                    const Text(
                                        style: TextStyle(fontSize: 12, fontWeight: FontWeight.w500, fontFamily: "Arial"),
                                        "Lembrar senha"
                                    ),
                                    const SizedBox(
                                        width: 200,
                                        child: Padding(
                                            padding: EdgeInsets.only(left: 80),
                                            child: Text(
                                                style: TextStyle(fontSize: 12, fontWeight: FontWeight.w500, fontFamily: "Arial"),
                                                "Esqueci minha senha"
                                            ),    
                                        ),
                                    )
                                ],
                            )
                        ),
                        Row(
                            children: [
                                Padding(
                                    padding: const EdgeInsets.only(left: 10,top: 20),
                                    child: SizedBox(
                                        height: 50,
                                        width: 145,
                                        child: OutlinedButton(
                                            style: OutlinedButton.styleFrom(
                                                backgroundColor: const Color(0xff14c871), 
                                                shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(7), side: const BorderSide(width: 0)),
                                                side: const BorderSide(width: 1, color: Color(0xff14c871))
                                                ),
                                            onPressed: () {},
                                            child: const Center(child: Text("Acessar", style: TextStyle(fontSize: 12, color: Colors.black, fontFamily: "Arial"),)),
                                        ),
                                    ),
                                ),
                                Padding(
                                    padding: const EdgeInsets.only(left: 20,top: 20),
                                    child: SizedBox(
                                        height: 50,
                                        width: 145,
                                        child: OutlinedButton(
                                            style: OutlinedButton.styleFrom(
                                                backgroundColor: const Color(0xffffffff), 
                                                shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(7), side: const BorderSide(width: 0)),
                                                side: const BorderSide(width: 1, color: Color(0xff14c871))
                                                ),
                                            onPressed: () {},
                                            child: const Center(child: Text("Cadastrar", style: TextStyle(fontSize: 12, color: Colors.black, fontFamily: "Arial"),)),
                                        ),
                                    ),
                                ),
                            ],
                        ),
                        const Padding(
                            padding: EdgeInsets.only(left: 25, right: 25, top: 60),
                            child: Row(
                                children: <Widget>[
                                    Expanded(
                                        child: Divider()
                                    ),       
                            
                                    Padding(
                                        padding: EdgeInsets.only(left: 10, right: 10),
                                        child: Text(
                                            style: TextStyle(fontSize: 12, fontFamily: "Arial"),
                                            "Ou continue com"
                                        ),
                                    ),        
                            
                                    Expanded(
                                        child: Divider()
                                    ),
                                ]
                            ),
                        ),
                        Padding(
                            padding: const EdgeInsets.only(top: 20),
                            child: Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: [
                                    SizedBox(
                                        height: 70,
                                        width: 70,
                                        child: Container(
                                            decoration: BoxDecoration(color: const Color(0xffF0F0F0),borderRadius: BorderRadius.circular(5)),
                                            child: Padding(
                                                padding: const EdgeInsets.all(8.0),
                                                child: Image.asset("images/Google.png"),
                                            ),
                                        ),
                                    ),
                                    Padding(
                                        padding: const EdgeInsets.only(left: 20),
                                        child: SizedBox(
                                            height: 70,
                                            width: 70,
                                            child: Container(
                                                decoration: BoxDecoration(color: const Color(0xffF0F0F0),borderRadius: BorderRadius.circular(5)),
                                                child: Padding(
                                                    padding: const EdgeInsets.all(8.0),
                                                    child: Image.asset("images/Facebook.png"),
                                                ),
                                            ),
                                        ),
                                    ),
                                ],
                            ),
                        )
                    ],
                ),
            ),
        );
    }
}