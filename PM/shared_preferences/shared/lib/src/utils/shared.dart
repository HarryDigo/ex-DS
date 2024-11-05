import 'package:shared_preferences/shared_preferences.dart';

class SharedPrefs {
    static const String _isLoggedInKey = 'isLoggedIn';

    static Future<void> setLoginStatus(bool isLoggedIn) async {
        final prefs = await SharedPreferences.getInstance();
        await prefs.setBool(_isLoggedInKey, isLoggedIn);
    }

    static Future<bool> getLoginStatus() async {
        final prefs = await SharedPreferences.getInstance();
        return prefs.getBool(_isLoggedInKey) ?? false;
    }

    static Future<void> removeLoginStatus() async {
        final prefs = await SharedPreferences.getInstance();
        await prefs.remove(_isLoggedInKey);
    }
}