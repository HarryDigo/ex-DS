import 'package:flutter/material.dart';

class Classification extends StatelessWidget {
    const Classification({super.key, required this.classif,});

    final String classif;

    @override
    Widget build(BuildContext context) {
        return Padding(
            padding: const EdgeInsets.only(top: 8),
            child: Text(classif),
        );
    }
}