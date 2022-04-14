import { useForm } from 'react-hook-form';
import './styles.css';

type FormState = {
    name: string;
    price: string;
    description: string;
    imgUrl: string;
}

function Home() {

    const { register, handleSubmit, setValue } = useForm<FormState>();

    const onSubmit = (data: FormState) => {
        console.log(data.price);
    }

    return (
        <form onSubmit={handleSubmit(onSubmit)}>
            <div className="container">
                <textarea
                    name="description"
                    className="form-control input-base"
                    placeholder="Descrição"
                    cols={5}
                    rows={3}
                />
                    <input {...register("name", { required: true, maxLength: 20 })} />
                <input
                    name="price"
                    type="number"
                    className="form-control input-base"
                    placeholder="Preço"
                />
                <button>
                    Submeter
                </button>
            </div>
        </form>
    );
}

export default Home;