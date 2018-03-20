function validate(input){
  console.log(input);
  return !!input.match(/^[A-Za-z]\w*@[\w-]+(\.\w+)+$/);
}