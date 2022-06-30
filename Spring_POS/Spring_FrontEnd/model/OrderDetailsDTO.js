function OrderDetailsDTO(orderID, code, quantity, uPrice, tot){
    let oid = orderID;
    let itemCode = code;
    let qty = quantity;
    let unitPrice = uPrice;
    let total = tot;

    this.getORDOrderId = function (){
        return oid;
    }
    this.getORDCode = function (){
        return itemCode;
    }
    this.getORDQty = function (){
        return qty;
    }
    this.getORDUPrice = function (){
        return unitPrice;
    }
    this.getORDTot = function (){
        return total;
    }

    this.setORDOrderID = function (orderID){
        oid = orderID;
    }
    this.setORDItmCode = function (code){
        itemCode = code;
    }
    this.setORDQty = function (quantity){
        qty = quantity;
    }
    this.setORDUPrice = function (uPrice){
        unitPrice = uPrice;
    }
    this.setORDTot = function (tot){
        total = tot;
    }
}