import 'package:flutter/material.dart';

void main() {
    runApp(const MyApp());
}

class MyApp extends StatelessWidget {
    const MyApp({super.key});

    @override
    Widget build(BuildContext context) {
        return const MaterialApp(
            home: Home(),
        );
    }
}

class Home extends StatelessWidget {
    const Home({super.key});

    @override
    Widget build(BuildContext context) {
        return  Scaffold(
            body: Column(
                children: [
                    const Center(
                        child: Icon(Icons.add_moderator_outlined, size: 400.0),
                    ),
                    Row(
                        mainAxisAlignment: MainAxisAlignment.spaceAround,
                        children: [
                            OutlinedButton.icon(
                                onPressed: () {},
                                icon: const Icon(Icons.add),
                                label: const Text("amogus", textAlign: TextAlign.center,),
                            ),
                            OutlinedButton.icon(
                                onPressed: () {},
                                icon: const Icon(Icons.remove),
                                label: const Text("ayaya", textAlign: TextAlign.center,),
                            ),
                        ],
                    ),
                ],
            ),
        );
    }
}