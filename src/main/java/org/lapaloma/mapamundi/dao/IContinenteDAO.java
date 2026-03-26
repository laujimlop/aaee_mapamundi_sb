package org.lapaloma.mapamundi.dao;

import java.util.List;

import org.lapaloma.mapamundi.vo.Continente;

public interface IContinenteDAO {
    public Continente obtenerContinentePorClave(String codigo);

    public void actualizarContinente(Continente continente);

    public void crearContinente(Continente continente);

    public void borrarContinente(Continente continente);

    public List<Continente> obtenerListaContinentes();

    public List<Continente> obtenerContinentePorNombre(String nombre);
}
