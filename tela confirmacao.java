AlertDialog.Builder builder = new AlertDialog.Builder(EditarValor.this);
                builder.setMessage("Tem certeza que deseja excluir ?")
                        .setCancelable(false)
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //Ação
                            }
                        })
                        .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
				//Ação
                            }
                        });
                AlertDialog alerta = builder.create();
                alerta.show();