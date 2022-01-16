package ru.vsu.cs.okshina_v_a;

import java.util.Locale;

class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(() -> new FrameMain().setVisible(true));
    }
}