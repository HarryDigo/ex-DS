import 'package:flutter/material.dart';

class IdealWeight extends StatelessWidget {
    const IdealWeight({super.key, required this.idealW,});

    final String idealW;

    @override
    Widget build(BuildContext context) {
        return Padding(
            padding: const EdgeInsets.only(top: 8),
            child: Text(idealW),
        );
    }
}