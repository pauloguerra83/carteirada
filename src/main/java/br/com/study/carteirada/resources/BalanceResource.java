package br.com.study.carteirada.resources;

import br.com.study.carteirada.dtos.BalanceDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balances")
public class BalanceResource {

    public BalanceResource() {
    }

    @GetMapping("/{login}/balance")
    public ResponseEntity<BalanceDTO> consultarSaldo(@PageableDefault(page = 0, size = 20) Pageable paginacao,
                                                     @PathVariable String login) {
      /*  BalanceDTO balanceDTO = usuarioService.consultar(login);
        return responderSucessoComItem(usuarioDTO);*/
        return null;
    }
}
