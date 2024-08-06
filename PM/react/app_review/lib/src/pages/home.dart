import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

import '../components/general_appbar.dart';

class Home extends StatefulWidget {
    const Home({super.key});

    @override
    _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
    @override
    Widget build(BuildContext context) {
        return Scaffold(
            body: Padding(
              padding: const EdgeInsets.all(8.0),
              child: Column(
                  children: [
                      Container(),
                      Container()
                  ],
              ),
            ),
            appBar: appBarGen,
            drawer: const Drawer(
                
            ),
            /*bottomNavigationBar: BottomNavigationBar(
                items: const [
                    BottomNavigationBarItem(icon: Text("oi"))
                ],
            ),*/
            floatingActionButton: FloatingActionButton(
                onPressed: () {print("gala sólida");},
            ),
        );
    }
}

const boxDecor = BoxDecoration(
    
);