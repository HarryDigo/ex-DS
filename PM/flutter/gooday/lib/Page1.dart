import 'package:flutter/material.dart';
import 'package:gooday/page2.dart';

//AVISO PARA O RAFAEL OU LUIS EDUARDO:
//
//Vou deixar sem comentário, mas confia, fui eu que fiz tudo (da para ver pela gambiarra) e consigo explicar tudo (menos aqueles expanded da row la embaixo na pagina 2 que eu realmente peguei da internet (divisória fofa))
//
//Trabalhodo rodrigo scatolin flora do rio do 2° DS
//
//Mais uma coisa, o trabalho inteiro foi feito para EXATAMENTE a configuração do samsung galaxy s8+ na exibição mobile do inspecionar do google, se estiver errado fora disso não é culpa minha (é sim)

class Page1 extends StatelessWidget {
    const Page1({super.key});

    @override 
    Widget build(BuildContext context) {
        return Scaffold(
            body: Column(
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                    Padding(
                      padding: const EdgeInsets.only(top: 80),
                      child: Image.asset("images/casualdog.png", width: 360,),
                    ),
                    const Padding(
                        padding: EdgeInsets.only(top: 40),
                        child: Text(
                            style: TextStyle(fontSize: 36, fontWeight: FontWeight.bold, fontFamily: "Arial"),
                            "Ótimo dia!"
                        ),
                    ),
                    const Padding(
                        padding: EdgeInsets.only(top: 4),
                        child: Text(
                            style: TextStyle(fontSize: 12, fontWeight: FontWeight.bold, fontFamily: "Arial"),
                            "Como deseja acessar?"
                        ),
                    ),
                    Padding(
                        padding: const EdgeInsets.only(top: 40),
                        child: SizedBox(
                            height: 50,
                            width: 320,
                            child: OutlinedButton(
                                style: OutlinedButton.styleFrom(
                                    side: const BorderSide(width: 1, color: Color(0xff14c871)),
                                    backgroundColor: const Color(0xff14c871), 
                                    shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(7), )
                                    ),
                                onPressed: () {},
                                child: Row(
                                    children: [
                                        SizedBox(
                                            height: 35,
                                            width: 35,
                                            child: Container(
                                                decoration: BoxDecoration(color: const Color(0xffFFFEFE),borderRadius: BorderRadius.circular(5), border: Border.all(color: const Color(0xff14c871), width: 2)),
                                                child: Image.asset("images/Google.png"),
                                                ),
                                        ),
                                        const Padding(
                                            padding: EdgeInsets.only(left: 45),
                                            child: Center(child: Text("Como deseja acessar?", style: TextStyle(fontSize: 12, color: Colors.white),)),
                                        )
                                    ],
                                )
                            ),
                        ),
                    ),
                    Padding(
                        padding: const EdgeInsets.only(top: 10),
                        child: SizedBox(
                            height: 50,
                            width: 320,
                            child: OutlinedButton(
                                
                                style: OutlinedButton.styleFrom(
                                    backgroundColor: const Color(0xffffffff), 
                                    shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(7), side: const BorderSide(width: 0)),
                                    side: const BorderSide(width: 1, color: Color(0xff14c871))
                                    ),
                                onPressed: () {
                                    Navigator.push(context, MaterialPageRoute(builder: (context) => const Page2()));
                                },
                                child: const Center(child: Text("Outras Opções", style: TextStyle(fontSize: 12, color: Colors.black, fontFamily: "Arial"),)),
                            ),
                        ),
                    )
                ],
            ),
        );
    }
}