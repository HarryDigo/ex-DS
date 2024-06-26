import 'package:flutter/material.dart';
import 'package:gooday/page1.dart';

//AVISO PARA O RAFAEL OU LUIS EDUARDO:
//
//Vou deixar sem comentário, mas confia, fui eu que fiz tudo (da para ver pela gambiarra) e consigo explicar tudo (menos aqueles expanded da row la embaixo na pagina 2 que eu realmente peguei da internet (divisória fofa))
//
//Trabalhodo rodrigo scatolin flora do rio do 2° DS
//
//Mais uma coisa, o trabalho inteiro foi feito para EXATAMENTE a configuração do samsung galaxy s8+ na exibição mobile do inspecionar do google, se estiver errado fora disso não é culpa minha (é sim)

class SplashScreen extends StatefulWidget {
    const SplashScreen({super.key});

    @override
    State<SplashScreen> createState() => _ScreenState();
}

class _ScreenState extends State<SplashScreen> {

    @override
    void initState() {
        super.initState();
        Future.delayed(const Duration(seconds: 4))
            .then((_) => {
                Navigator.push(context, MaterialPageRoute(builder: (context) => const Page1()))
            });
    }
    @override 
    Widget build(BuildContext context) {
        return Scaffold(
            backgroundColor: const Color(0xff14c871),
            body: Center(
                child: Image.asset("images/Logotipo.png"),
            ),
        );
    }
}