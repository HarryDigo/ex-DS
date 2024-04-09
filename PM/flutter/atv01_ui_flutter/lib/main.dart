import 'dart:ui';

import 'package:flutter/material.dart';

void main() {
    runApp(MyApp());
}

class MyApp extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
        return const MaterialApp(
            home: Scaffold(
                body: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                        Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: [
                                SizedBox(
                                    width: 80,
                                    child: Icon(
                                        Icons.account_circle,
                                        size: 60,
                                    ),
                                ),
                                Column(
                                    crossAxisAlignment: CrossAxisAlignment.start,
                                    children: [
                                        Text(
                                            "Flutter McFlutter",
                                            style: TextStyle(fontSize: 22),
                                        ),
                                        Text("Experienced App Developer")
                                    ],
                                )
                            ],
                        ),
                        SizedBox(
                            height:40,
                            child: Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: [
                                    SizedBox(
                                        width:160,
                                        child: Text("123 Main Street"),
                                    ),
                                    Text("(415) 555-0198"),
                                ],
                            ),
                        ),
                        Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: [
                                SizedBox(
                                    width: 60,
                                    child: Icon(Icons.accessibility_new),
                                ),
                                SizedBox(
                                    width: 60,
                                    child: Icon(Icons.timer),
                                ),
                                SizedBox(
                                    width: 60,
                                    child: Icon(Icons.phone_android),
                                ),
                                SizedBox(
                                    width: 60,
                                    child: Icon(Icons.phone_iphone),
                                ),
                            ]
                        )
                    ],
                ),
            ),
        );
    }       
}