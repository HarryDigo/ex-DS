import 'package:flutter/material.dart';

class Page1 extends StatelessWidget {
    const Page1({super.key});

    @override 
    Widget build(BuildContext context) {
        return Scaffold(
            body: Column(
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                    Padding(
                      padding: const EdgeInsets.only(top: 100),
                      child: Image.asset("images/casualdog.png", width: double.infinity,),
                    ),
                    const Padding(
                        padding: EdgeInsets.only(top: 50),
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
                    )
                ],
            ),
        );
    }
}