package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllItems() {
         return new ResponseUtil(200,"Items Returned Done",itemService.getAllItems());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveItem(@ModelAttribute ItemDTO itemDTO) {
        itemService.saveItem(itemDTO);
        return new ResponseUtil(200,"Item Successfully Saved",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateItem(@RequestBody ItemDTO itemDTO) {
        itemService.updateItem(itemDTO);
        return new ResponseUtil(200,"Item Successfully Updated",null);
    }

    @DeleteMapping(params = {"code"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteItem(@RequestParam String code) {
        itemService.deleteItem(code);
        return new ResponseUtil(200,"Item Successfully Deleted",null);
    }

    @GetMapping(path = "/{code}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchItem(@PathVariable String code) {
        return new ResponseUtil(200,"Item Successfully Collected",itemService.searchItem(code));
    }

    @GetMapping(path = "all")
    public ResponseUtil getAllIds() {
        return new ResponseUtil(200,"Successfully Returned !!",itemService.getAllItemIDS());
    }

}
