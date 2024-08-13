import 'package:flutter/material.dart';

import '../components/general_appbar.dart';
import '../components/bmi_form.dart';

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
                        const Text("BQ Health", style: titleStyle,),
                        Padding(
                            padding: const EdgeInsets.only(top: 30),
                            child: Container(
                                decoration: boxDecor,
                                width: double.infinity,
                                child: const BmiForm(),
                            ),
                        )
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

const titleStyle = TextStyle(
    fontSize: 32,
    fontFamily: "Arial",
    color: Color(0xff3399ff),
    fontWeight: FontWeight.bold,
);

const boxDecor = BoxDecoration(
    color: Color(0xffd1d5d9),
    borderRadius: BorderRadius.only(
        topLeft: Radius.circular(20),
        topRight: Radius.circular(20)
    )
);