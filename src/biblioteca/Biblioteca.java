package biblioteca;

import models.Material;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Material> materiais;

    public Biblioteca() {
        this.materiais = new ArrayList<>();
    }

    public void adicionarMaterial(Material material) {
        materiais.add(material);
        System.out.println("Novo material cadastrado com sucesso!");
    }

    public Material pesquisarPorTitulo(String titulo) {
        for (Material material : materiais) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }

    public boolean excluirMaterial(String titulo) {
        Material material = pesquisarPorTitulo(titulo);
        if (material != null) {
            materiais.remove(material);
            System.out.println("Material excluído com sucesso!");
            return true;
        }
        System.out.println("Material não encontrado!");
        return false;
    }

    public void listarMateriais() {
        if (materiais.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Lista de materiais na biblioteca:");
            for (Material material : materiais) {
                System.out.println(material);
            }
        }
    }
}

