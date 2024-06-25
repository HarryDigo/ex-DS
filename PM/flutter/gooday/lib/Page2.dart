import 'package:flutter/material.dart';

class Page2 extends StatelessWidget {
    const Page2({super.key});

    @override 
    Widget build(BuildContext context) {
        return Scaffold(
            body: Padding(
                padding: const EdgeInsets.only(left: 15, right: 15),
                child: Column(
                    children: [
                        IconButton(onPressed: () {Navigator.pop(context);}, icon: const Icon(Icons.arrow_back),),
                        const Text(
                            style: TextStyle(fontSize: 36, fontWeight: FontWeight.bold, fontFamily: "Arial"),
                            "Acesse"
                        ),
                    ],
                ),
            )
        );
    }
}