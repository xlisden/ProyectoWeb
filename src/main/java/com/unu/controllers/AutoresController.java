package com.unu.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.unu.models.AutoresModel;

public class AutoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AutoresModel autoresModelo = new AutoresModel();

	public AutoresController() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("listaAutores", autoresModelo.listarAutores());
		request.getRequestDispatcher("/autores/listaAutores.jsp");
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
		if (request.getParameter("opcion") == null) {
			// TODO Listar autores
		}

		String operacion = request.getParameter("");

		switch (operacion) {
		case "listar": {
			// TODO Listar autores
			break;
		}
		case "nuevo":
			// TODO Registrar autores
			break;
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
