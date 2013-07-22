package com.engsofti.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.engsofti.dados.Aluno;
import com.engsofti.dados.Disciplina;
import com.engsofti.dados.EmailSender;
import com.engsofti.dados.Repositorio;

@Controller
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AlunoController {

	Repositorio repositorio = Repositorio.getInstance();
	
	@Autowired
	EmailSender email;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/cadastroDisciplina", method = RequestMethod.GET)
	public ModelAndView logado() {
		return new ModelAndView("cadastroDisciplina","disciplina",new Disciplina());
	}
	
	@RequestMapping(value="/cadastroDisciplina", method = RequestMethod.POST)
	public ModelAndView logado(Disciplina disciplina) {
		String matriculaSessao = getMatriculaAlunoSessao();
		Aluno aluno=repositorio.encontraAluno(matriculaSessao);
		System.out.println(aluno.getNome());
		aluno.getDisciplinas().add(disciplina);
		System.out.println(aluno.getDisciplinas());
		return new ModelAndView("listaDisciplinas","disciplinas",aluno.getDisciplinas());
	}
	
	@RequestMapping(value="/listaDisciplina", method = RequestMethod.GET)
	public ModelAndView listaDisciplinas() {
		String matriculaSessao = SecurityContextHolder.getContext().getAuthentication().getName();
		Aluno aluno=repositorio.encontraAluno(matriculaSessao);
		email.verificaEnvio(aluno);
		return new ModelAndView("listaDisciplinas","disciplinas",aluno.getDisciplinas());
	}
	
	@RequestMapping(value="/cadastraAtividade/{nomeDisciplina}", method = RequestMethod.GET)
	public ModelAndView cadastraAtividade(@PathVariable String nomeDisciplina) {
		return new ModelAndView("cadastroAtividade","nomeDisciplina",nomeDisciplina);
	}
	
	@RequestMapping(value="/cadastraAtividade", method = RequestMethod.POST)
	public String cadastraAtividadePost(@RequestParam("nomeDisciplina") String nomeDisciplina,
										@RequestParam("pesoAtividade") String peso,
										@RequestParam("dataAtividade") String data,
										@RequestParam("conteudoAtividade") String conteudo,
										@RequestParam("notaAtividade") String nota,
										@RequestParam("tipoAtividade") String tipoAtividade) {
		System.out.println(nomeDisciplina);
		Disciplina disciplina = repositorio.encontraAluno(getMatriculaAlunoSessao()).encontraDisciplinaPeloNome(nomeDisciplina);
		System.out.println(disciplina.getNome());
//		disciplina.getAtividades().add(
//				new Prova(	service.buildDateTime(data),
//							Double.parseDouble(nota),
//							Integer.parseInt(peso),
//							conteudo
//						)
//		);
		System.out.println(disciplina.getAtividades().get(0));
		return "listaDisciplinas";
	}
	
	@RequestMapping(value="/cadastroAluno", method = RequestMethod.GET)
	public String cadastro() {
		return "cadastroAluno";
	}
	
	@RequestMapping(value="/cadastroAluno", method = RequestMethod.POST)
	public String cadastro(@RequestParam("nomeAluno") String nome,
							@RequestParam("senha") String senha,
							@RequestParam("email") String email,
							@RequestParam("matricula") String matricula,
							@RequestParam("curso") String curso ) {
		
		Aluno aluno = new Aluno().setEmail(email).setMatricula(matricula).setNome(nome);
		repositorio.salvaOuAtualiza(aluno);
		
		
		return"login";
	}
	
	public String getMatriculaAlunoSessao(){
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
	
	
	
	
	
	
	
	
//	@Autowired
//	private VeiculoService veiculoService;
//	
//	
//	@RequestMapping(value = "/cadastro",method = RequestMethod.GET )
//	public ModelAndView newVeiculo(){
//		return new ModelAndView("veiculos/cadastro", "veiculo", new Veiculo());
//	}
//	@RequestMapping(value = "/cadastro",method = RequestMethod.POST )
//	public String newVeiculo( Veiculo veiculo ){
//		veiculoService.save( veiculo );
//		return "redirect:lista";
//	}
//----------------------------------------------------------------------------------		
//	@RequestMapping("/lista")
//	public ModelAndView list(){
//		return new ModelAndView("veiculos/lista", "lista", veiculoService.listVeiculos());
//	}
//	
//	@RequestMapping(value = "/cadastro",method = RequestMethod.GET )
//	public ModelAndView newVeiculo(){
//		return new ModelAndView("cadastro", "veiculo", new Veiculo());
//	}
//	@RequestMapping(value = "/cadastro",method = RequestMethod.POST )
//	public String newVeiculo( Veiculo veiculo ){
//		veiculoService.save( veiculo );
//		return "redirect:lista";
//	}
//	
//----------------------------------------------------------------------------------
//	@RequestMapping(value="/description/{id}",method = RequestMethod.GET)
//	public ModelAndView list2( @PathVariable Long id ){
//		Veiculo veiculo = veiculoService.find( id );
//		return new ModelAndView("veiculos/description", "veiculo", veiculo);
//	}
//	
//	@RequestMapping(value = "/edit/{id}",method = RequestMethod.GET )
//	public ModelAndView edit( @PathVariable Long id ){
//		Veiculo veiculo = veiculoService.find( id );
//		logs[id.intValue()]=veiculo.getPreco()+",";
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("veiculos/edit");
//		mv.addObject("listaFotos",manipulaURL(veiculo.getFotos()));
//		mv.addObject("veiculo", veiculo);
//		return mv;
//	}
//	@RequestMapping(value = "/edit",method = RequestMethod.POST )
//	public String edit( Veiculo veiculo ){
//		veiculoService.save( veiculo );
//		return "redirect:lista";
//	}	
//----------------------------------------------------------------------------------	
//	@RequestMapping(value = "/delete/{id}",method = RequestMethod.GET )
//	public ModelAndView delete( @PathVariable Long id ){
//		Veiculo veiculo = veiculoService.find( id );
//		return new ModelAndView("veiculos/delete", "veiculo", veiculo);
//	}
//	@RequestMapping(value = "/delete",method = RequestMethod.POST )
//	public String delete( Veiculo veiculo ){
//		veiculoService.remove( veiculo );
//		return "redirect:lista";
//	}
//----------------------------------------------------------------------------------	
//	@RequestMapping(value = "/galeria/{id}",method = RequestMethod.GET )
//	public ModelAndView mostraFotos( @PathVariable Long id ){
//		Veiculo veiculo = veiculoService.find( id );
//		return new ModelAndView("veiculos/galeria", "listFotos",manipulaURL(veiculo.getFotos()));
//	}
//----------------------------------------------------------------------------------
//	public List<String> manipulaURL(String fotos){
//		String[] fotosAux= fotos.split(",");
//		List<String> listaFinal = new ArrayList<String>();
//		for (int i = 0; i < fotosAux.length; i++) {
//			if(!fotosAux[i].equals("")){
//				listaFinal.add(fotosAux[i]);
//			}
//		}
//		return listaFinal;
//	}
//	public void setVeiculoService(VeiculoService veiculoService) {
//		this.veiculoService = veiculoService;
//	}
}